import java.lang.Integer.parseInt;
class CalculatorParser(private val tokens: List<CalculatorToken>) {
	private var curPos = 0
	
	private fun skipToken() = curPos++
	private fun currentToken() = tokens[curPos]
	
	private fun expectedToken(expectedToken: CalculatorTokenEnum) {
	    if (currentToken().type != expectedToken) {
	        throw Exception("expected: ${expectedToken} actual: ${currentToken().type}")
	    }
	}
	
	fun parse_start(): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.LR -> {
				val expr_valp: int = int()

				val expr: Node = parse_expr(expr_valp)

				println(expr_valp.value)
    
			    Node("T_start", listOf(
			        expr
			    ))
			}
			CalculatorTokenEnum.NUMBER -> {
				val expr_valp: int = int()

				val expr: Node = parse_expr(expr_valp)

				println(expr_valp.value)
    
			    Node("T_start", listOf(
			        expr
			    ))
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_expr(valp: int): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.LR -> {
				val mulDiv_valp: int = int()

				val mulDiv: Node = parse_mulDiv(mulDiv_valp)
				val addSubP_valp: int = int()

				val addSubP: Node = parse_addSubP(mulDiv_valp, addSubP_valp)

				valp.value = addSubP_valp.value
    
			    Node("T_expr", listOf(
			        mulDiv, addSubP
			    ))
			}
			CalculatorTokenEnum.NUMBER -> {
				val mulDiv_valp: int = int()

				val mulDiv: Node = parse_mulDiv(mulDiv_valp)
				val addSubP_valp: int = int()

				val addSubP: Node = parse_addSubP(mulDiv_valp, addSubP_valp)

				valp.value = addSubP_valp.value
    
			    Node("T_expr", listOf(
			        mulDiv, addSubP
			    ))
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_addSubP(i: int, valp: int): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.PLUS -> {				
				val PLUS_text: string = string()
				
				val PLUS: Node = parseTerm_PLUS(PLUS_text)
				val addSubP_valp: int = int()

				val addSubP: Node = parse_addSubP(i + mulDiv_valp, addSubP_valp)
				val mulDiv_valp: int = int()

				val mulDiv: Node = parse_mulDiv(mulDiv_valp)

				valp.value = addSubP_valp.value
    
			    Node("T_addSubP", listOf(
			        PLUS, addSubP, mulDiv
			    ))
			}
			CalculatorTokenEnum.MINUS -> {				
				val MINUS_text: string = string()
				
				val MINUS: Node = parseTerm_MINUS(MINUS_text)
				val addSubP_valp: int = int()

				val addSubP: Node = parse_addSubP(mulDiv_valp - i, addSubP_valp)
				val mulDiv_valp: int = int()

				val mulDiv: Node = parse_mulDiv(mulDiv_valp)

				valp.value = addSubP_valp.value
    
			    Node("T_addSubP", listOf(
			        MINUS, addSubP, mulDiv
			    ))
			}
			CalculatorTokenEnum.EOF -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.LR -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.NUMBER -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.RR -> {
				valp.value = i.value
			    Node("EPS")
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_mulDiv(valp: int): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.LR -> {
				val unary_valp: int = int()

				val unary: Node = parse_unary(unary_valp)
				val mulDivP_valp: int = int()

				val mulDivP: Node = parse_mulDivP(unary_valp, mulDivP_valp)

				valp.value = mulDivP_valp.value
    
			    Node("T_mulDiv", listOf(
			        unary, mulDivP
			    ))
			}
			CalculatorTokenEnum.NUMBER -> {
				val unary_valp: int = int()

				val unary: Node = parse_unary(unary_valp)
				val mulDivP_valp: int = int()

				val mulDivP: Node = parse_mulDivP(unary_valp, mulDivP_valp)

				valp.value = mulDivP_valp.value
    
			    Node("T_mulDiv", listOf(
			        unary, mulDivP
			    ))
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_mulDivP(i: int, valp: int): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.MUL -> {				
				val MUL_text: string = string()
				
				val MUL: Node = parseTerm_MUL(MUL_text)
				val unary_valp: int = int()

				val unary: Node = parse_unary(unary_valp)
				val mulDivP_valp: int = int()

				val mulDivP: Node = parse_mulDivP(i * unary_valp, mulDivP_valp)

				valp.value = mulDivP_valp.value
    
			    Node("T_mulDivP", listOf(
			        MUL, unary, mulDivP
			    ))
			}
			CalculatorTokenEnum.DIV -> {				
				val DIV_text: string = string()
				
				val DIV: Node = parseTerm_DIV(DIV_text)
				val unary_valp: int = int()

				val unary: Node = parse_unary(unary_valp)
				val mulDivP_valp: int = int()

				val mulDivP: Node = parse_mulDivP(i / unary_valp, mulDivP_valp)

				valp.value = mulDivP_valp.value
    
			    Node("T_mulDivP", listOf(
			        DIV, unary, mulDivP
			    ))
			}
			CalculatorTokenEnum.PLUS -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.MINUS -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.EOF -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.LR -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.NUMBER -> {
				valp.value = i.value
			    Node("EPS")
			}
			CalculatorTokenEnum.RR -> {
				valp.value = i.value
			    Node("EPS")
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}

	fun parse_unary(valp: int): Node{
		return when (currentToken().type) {
			CalculatorTokenEnum.LR -> {				
				val LR_text: string = string()
				
				val LR: Node = parseTerm_LR(LR_text)
				val expr_valp: int = int()

				val expr: Node = parse_expr(expr_valp)
				
				val RR_text: string = string()
				
				val RR: Node = parseTerm_RR(RR_text)

				valp.value = expr_valp.value
    
			    Node("T_unary", listOf(
			        LR, expr, RR
			    ))
			}
			CalculatorTokenEnum.NUMBER -> {				
				val NUMBER_text: string = string()
				
				val NUMBER: Node = parseTerm_NUMBER(NUMBER_text)

				valp.value = parseInt(NUMBER_text.value)
    
			    Node("T_unary", listOf(
			        NUMBER
			    ))
			}

	        else -> throw Exception("Unexpected token in a state")
	    }
	}


	fun parseTerm_LR(text: string): Node {
	    expectedToken(CalculatorTokenEnum.LR)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_LR", listOf(Node(text.value)))
	}

	fun parseTerm_RR(text: string): Node {
	    expectedToken(CalculatorTokenEnum.RR)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_RR", listOf(Node(text.value)))
	}

	fun parseTerm_PLUS(text: string): Node {
	    expectedToken(CalculatorTokenEnum.PLUS)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_PLUS", listOf(Node(text.value)))
	}

	fun parseTerm_MINUS(text: string): Node {
	    expectedToken(CalculatorTokenEnum.MINUS)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_MINUS", listOf(Node(text.value)))
	}

	fun parseTerm_MUL(text: string): Node {
	    expectedToken(CalculatorTokenEnum.MUL)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_MUL", listOf(Node(text.value)))
	}

	fun parseTerm_DIV(text: string): Node {
	    expectedToken(CalculatorTokenEnum.DIV)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_DIV", listOf(Node(text.value)))
	}

	fun parseTerm_NUMBER(text: string): Node {
	    expectedToken(CalculatorTokenEnum.NUMBER)
	    text.value = currentToken().data!!
	    skipToken()
	    return Node("T_NUMBER", listOf(Node(text.value)))
	}
}