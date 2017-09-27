import java.awt.Image

abstract class DungeonEntity (val sprite: Image, val name: String)
{
    var x = 0; private set
    var y = 0; private set
    
    protected fun move(newX: Int, newY: Int)
    {
        // do some error checking stuff here
        x = newX
        y = newY
    }
}
