class CalculatorLexicalAnalyser {
    private var len = 0
    private var curPos: Int = 0
    private var data: String? = null
    private var str:String = ""

    fun getTokens(s: String): List<CalculatorToken> {
        len = s.length
        str = s

        val tokens = mutableListOf<CalculatorToken>()
        var token: CalculatorToken?
        do {
            token = getNextToken()
            if (token != null) tokens.add(token)
        } while (token != null)
        return tokens + CalculatorToken(CalculatorTokenEnum.EOF)
    }
    
    private fun find(value: String): Boolean {
        val regex = value.toRegex()
        val match = regex.find(str, curPos)
        data = match?.value
        return match != null && match.range.first == curPos
    }

    private fun getNextToken(): CalculatorToken? {
        while (curPos < len && str[curPos].isWhitespace()) {
            curPos++
        }

        if (curPos == len) {
            return null
        }

        return when {
			find("\\(") -> CalculatorToken(CalculatorTokenEnum.LR, data).also{ curPos += data!!.length }
			find("\\)") -> CalculatorToken(CalculatorTokenEnum.RR, data).also{ curPos += data!!.length }
			find("\\+") -> CalculatorToken(CalculatorTokenEnum.PLUS, data).also{ curPos += data!!.length }
			find("\\-") -> CalculatorToken(CalculatorTokenEnum.MINUS, data).also{ curPos += data!!.length }
			find("\\*") -> CalculatorToken(CalculatorTokenEnum.MUL, data).also{ curPos += data!!.length }
			find("\\/") -> CalculatorToken(CalculatorTokenEnum.DIV, data).also{ curPos += data!!.length }
			find("[1-9][0-9]*") -> CalculatorToken(CalculatorTokenEnum.NUMBER, data).also{ curPos += data!!.length }
            else -> throw Exception("Unexpected symbol at curPos $curPos")
        }
    }
}