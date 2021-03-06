/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();	
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGulls();
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\640x480.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
 
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\Master Sai Gantla\\Desktop\\pixLab\\images\\swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater(); <--- didn't do, optional challenge
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
      //testMirrorGull();
    //testMirrorDiagonal(); <--- didn't do, optional challenge
	//testCollage();
    //testEdgeDetection();
    //testEdgeDetection2(); <--- didn't do, "work in groups"
    //testChromakey(); <--- this isn't even in the doc
    //testEncodeAndDecode(); <--- neither is this
    //testGetCountRedOverValue(250); <--- neither is this
    //testSetRedToHalfValueInTopHalf(); <--- neither is this
    //testClearBlueOverValue(200); <--- neither is this
    //testGetAverageForColumn(0); <--- neither is this
  }
}