class Dictionnaire {
    val entries = mutableListOf<Entree>()

    fun nombreEntrees(): Int {
        return entries.size
    }

    fun ajouter(e: Entree) {
        if (entries.contains(e)) {
            throw IllegalArgumentException("L'entrée existe déjà dans le dictionnaire.")
        } else {
            entries.add(e)
        }
    }

    fun supprimer(e: Entree): Boolean {
        return entries.remove(e)
    }

    fun supprimer(motFrancais: String): Boolean {
        for (e in entries) {
            if (e.motFrancais == motFrancais) {
                entries.remove(e)
                return true
            }
        }
        return false
    }

    fun anFr(motAnglais: String): List<String> {
        val result = mutableListOf<String>()
        for (e in entries) {
            if (e.motAnglais == motAnglais) {
                result.add(e.motFrancais)
            }
        }
        return result
    }

    fun motsAnglais(): List<String> {
        val result = mutableListOf<String>()
        for (e in entries) {
            if (!result.contains(e.motAnglais)) {
                result.add(e.motAnglais)
            }
        }
        return result
    }

    fun dictionnaireAnFr(): Map<String, List<String>> {
        val result = mutableMapOf<String, MutableList<String>>()
        for (e in entries) {
            if (!result.containsKey(e.motAnglais)) {
                result[e.motAnglais] = mutableListOf(e.motFrancais)
            } else {
                result[e.motAnglais]?.add(e.motFrancais)
            }
        }
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (e in entries) {
            sb.append(e.toString()).append("\n")
        }
        return sb.toString()
    }

}