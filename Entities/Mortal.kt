import java.awt.Color

abstract class Mortal(protected val name: String, private val maxHealth: Float) : DungeonEntity()
{
    var health = maxHealth; protected set
    val healthColour: Color; get()
    {
        return when ((health * 100 / maxHealth).toInt())
        {
            in 67 .. 100 -> Color.green
            in  33 .. 66 -> Color.orange
            else -> Color.red
        }
    }

    fun takeDamage(healthLost: Float)
    {
        if (healthLost > 0) throw IllegalArgumentException("Health lost is $healthLost, which is greater than 0. Did you mean to call heal?")
        health -= healthLost
        if (health <= 0) die()
    }

    fun healFor(healthToHeal: Float)
    {
        if (healthToHeal < 0) throw IllegalArgumentException("Health lost is $healthToHeal, which is less than 0. Did you mean to call damage?")
        health = if (health + healthToHeal > maxHealth) maxHealth else health + healthToHeal
    }

    protected fun die() {  } // will show stats to screen, etc.
}
