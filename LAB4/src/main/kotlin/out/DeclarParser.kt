class DeclarParser(private val tokens: List<DeclarToken>) {
	private var curPos = 0
	
	private fun skipToken() = curPos++
	private fun currentToken() = tokens[curPos]
	
	private fun expectedToken(expectedToken: DeclarTokenEnum) {
	    if (currentToken().type != expectedToken) {
	        throw Exception("expected: ${expectedToken} actual: ${currentToken().type}")
	    }
	}
	
	fun parse_s(): Node{
		return when (currentToken().type) {
			DeclarTokenEnum.VAR -> {				
				val VAR_text: string = string()
				
				val VAR: Node = parseTerm_VAR(VAR_text)

				val f: Node = parse_f()

				val l: Node = parse_l()
				
				val SEMICOLON_text: string = string()
				
				val SEMICOLON: Node = parseTerm_SEMICOLON(SEMICOLON_text)

				val s: Node = parse_s()
    
			    Node("T_s", listOf(
			        VAR, f, l, SEMICOLON, s
			    ))
			}
			DeclarTokenEnum.EOF -> {			    Node("EPS")
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_l(): Node{
		return when (currentToken().type) {
			DeclarTokenEnum.COMMA -> {				
				val COMMA_text: string = string()
				
				val COMMA: Node = parseTerm_COMMA(COMMA_text)

				val f: Node = parse_f()

				val l: Node = parse_l()
    
			    Node("T_l", listOf(
			        COMMA, f, l
			    ))
			}
			DeclarTokenEnum.SEMICOLON -> {			    Node("EPS")
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_f(): Node{
		return when (currentToken().type) {
			DeclarTokenEnum.STAR -> {				
				val STAR_text: string = string()
				
				val STAR: Node = parseTerm_STAR(STAR_text)

				val f: Node = parse_f()
    
			    Node("T_f", listOf(
			        STAR, f
			    ))
			}
			DeclarTokenEnum.VAR -> {				
				val VAR_text: string = string()
				
				val VAR: Node = parseTerm_VAR(VAR_text)
    
			    Node("T_f", listOf(
			        VAR
			    ))
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}


	fun parseTerm_STAR(text: string): Node {
	    expectedToken(DeclarTokenEnum.STAR)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_STAR", listOf(Node(text.value)))
	}

	fun parseTerm_SEMICOLON(text: string): Node {
	    expectedToken(DeclarTokenEnum.SEMICOLON)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_SEMICOLON", listOf(Node(text.value)))
	}

	fun parseTerm_COMMA(text: string): Node {
	    expectedToken(DeclarTokenEnum.COMMA)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_COMMA", listOf(Node(text.value)))
	}

	fun parseTerm_VAR(text: string): Node {
	    expectedToken(DeclarTokenEnum.VAR)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_VAR", listOf(Node(text.value)))
	}
}