/*
 * @author oltruong
 */
package fr.oltruong.pattern.strategy.behavior;

public class CopterFlyingBehavior
    implements FlyingBehavior
{

    public void fly()
    {

        System.out.println( "J'utilise des hélices" );
    }

}
