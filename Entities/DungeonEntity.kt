abstract class DungeonEntity
{
    var x = 0; private set
    var y = 0; private set
    
    protected fun move(newX: int, newY: int)
    {
        // do some error checking stuff here
        x = newX
        y = newY
    }
}
