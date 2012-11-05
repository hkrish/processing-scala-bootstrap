
import processing.core._
import processing.core.PConstants._


/**
 * The PApplet subclass. This should be the main class. 
 * The "PBootstrap" object below is used to bootstrap
 * this applet into an application.
 *
 * The name of this class is important.
 * For instance, here the name "PBootstrapApplet" is used,
 * and the same is passed among other parameters to 
 * PApplet.main() method in the PBootstrap object.
 */
class PBootstrapApplet extends PApplet {

  override def setup() = {
    size(500, 500)
    background(38, 138,  210)

    /*
     *  Init your stuff here
     */
  }

  override def draw() {
    /*
     * Draw stuff here
     */
  }  
}


/**
 * This does the actual bootstraping.
 * This object is the main object that can be run.
 * When you rename this class make sure the filename is also the same! (?)
 */
object PBootstrap {
  /**
   * This was actually salvaged from the generated java source file
   * by the processing IDE, after exporting a sketch
   * @param passedArgs 
   */
  def main(passedArgs:Array[String]) {
    val appletArgs:Array[String] = Array[String]{"PBootstrapApplet"}
    if (passedArgs != null) {
      PApplet.main(appletArgs ++ passedArgs)
    } else {
      PApplet.main(appletArgs)
    }
    /*addWindowListener(this);*/
  }
}


