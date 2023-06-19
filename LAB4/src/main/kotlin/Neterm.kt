class Neterm (
    var init: String? = null,
    var name: String? = null,
    var params: MutableList<Pair<String, String>> = mutableListOf(),
    var returns: MutableList<Pair<String, String>> = mutableListOf(),
    var rules: MutableList<Rule> = mutableListOf(),
) {

    fun addParam(type: String, name: String){
        params.add(Pair(type, name))
    }

    fun addReturn(type: String, name: String){
        returns.add(Pair(type, name))
    }

    fun addRule(rule: Rule) {
        rules.add(rule)
    }

    override fun toString(): String {
        return "#${name ?: ""}"
    }
}