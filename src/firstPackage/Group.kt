package firstPackage

data class Group(val name: String,
                 val group: Array<Human>) {




    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Group

        if (name != other.name) return false
        if (!group.contentEquals(other.group)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + group.contentHashCode()
        return result
    }
}