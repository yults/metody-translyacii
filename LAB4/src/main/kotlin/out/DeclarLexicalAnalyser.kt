class DeclarLexicalAnalyser {
    private var len = 0
    private var curPos: Int = 0
    private var data: String? = null
    private var str:String = ""

    fun getTokens(s: String): List<DeclarToken> {
        len = s.length
        str = s

        val tokens = mutableListOf<DeclarToken>()
        var token: DeclarToken?
        do {
            token = getNextToken()
            if (token != null) tokens.add(token)
        } while (token != null)
        return tokens + DeclarToken(DeclarTokenEnum.EOF)
    }
    
    private fun find(value: String): Boolean {
        val regex = value.toRegex()
        val match = regex.find(str, curPos)
        data = match?.value
        return match != null && match.range.first == curPos
    }

    private fun getNextToken(): DeclarToken? {
        while (curPos < len && str[curPos].isWhitespace()) {
            curPos++
        }

        if (curPos == len) {
            return null
        }

        return when {
			find("\\*") -> DeclarToken(DeclarTokenEnum.STAR, data).also{ curPos += data!!.length }
			find("\\;") -> DeclarToken(DeclarTokenEnum.SEMICOLON, data).also{ curPos += data!!.length }
			find("\\,") -> DeclarToken(DeclarTokenEnum.COMMA, data).also{ curPos += data!!.length }
			find("[a-zA-Z][a-zA-Z0-9_]*") -> DeclarToken(DeclarTokenEnum.VAR, data).also{ curPos += data!!.length }
            else -> throw Exception("Unexpected symbol at curPos $curPos")
        }
    }
}