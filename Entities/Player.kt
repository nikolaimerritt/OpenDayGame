abstract class Player(playerName: String, private val playerClass: CharacterType, maxHP: Float) : Mortal(playerName, maxHP)
{
    var score = 0; private set
    val timeAlive: Float; get() = startTimeCount - (System.currentTimeMillis() / 1000).toFloat()
    private val startTime: Float = (System.currentTimeMillis() / 1000).toFloat()

    override fun toString(): String = name // add more here though...
}
