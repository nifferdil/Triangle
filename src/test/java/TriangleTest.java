import org.junit.*;
import static org.junit.Assert.*;


public class TriangleTest {

    @Test
    public void newTriangle_instantiatesCorrectly() {
      Triangle app = new Triangle(2,2,2);
      assertEquals(true, app instanceof Triangle);
    }

    @Test
    public void newTriangle_ifIsTriangle_true() {
      Triangle app = new Triangle(2,2,1);
      assertEquals(true, app.isTriangle());
    }


    @Test
    public void newTriangle_ifTriangleIsEquilateral_true() {
      Triangle app = new Triangle(2,2,2);
      assertEquals(true, app.isEquilateral());
      }

    @Test
    public void newTriangle_ifTriangleIsIsosceles_true() {
      Triangle app = new Triangle(2,2,1);
      assertEquals(true, app.isIsosceles());
      }



    @Test
    public void newTriangle_ifTriangleIsScalene_true() {
      Triangle app = new Triangle(1,2,3);
      assertEquals(true, app.isScalene());
      }

  }
