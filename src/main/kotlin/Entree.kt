class Entree (var motFrancais: String, var motAnglais: String) {

    init {
        require(motFrancais.isNotBlank()) { "Le mot français ne peut pas être vide ou blanc." }
        require(motAnglais.isNotBlank()) { "Le mot anglais ne peut pas être vide ou blanc." }
    }

    override fun toString(): String {
        return "$motFrancais:$motAnglais"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Entree
        return motFrancais == other.motFrancais
    }

    override fun hashCode(): Int {
        return motFrancais.hashCode()
    }
}