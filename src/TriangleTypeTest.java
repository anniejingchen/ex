import static junit.framework.Assert.*;

public class TriangleTypeTest {
    // triOut is output from the routine:
    //    Triang = 1 if triangle is scalene
    //    Triang = 2 if triangle is isosceles
    //    Triang = 3 if triangle is equilateral
    //    Triang = 4 if not a triangle
    //    Triang = 5 if the inputs are out of bounds
    @org.junit.Test
    public void triangleType() {
        assertEquals(1, TriangleType.triangleType(3,4,5));
        assertEquals(2, TriangleType.triangleType(3,3,5));
        assertEquals(2, TriangleType.triangleType(3,5,3));
        assertEquals(2, TriangleType.triangleType(5,3,3));
        assertEquals(3, TriangleType.triangleType(3,3,3));
        assertEquals(4, TriangleType.triangleType(3,4,1));
        assertEquals(4, TriangleType.triangleType(1,4,3));
        assertEquals(4, TriangleType.triangleType(1,3,4));
        assertEquals(4, TriangleType.triangleType(3,-4,5));
        assertEquals(4, TriangleType.triangleType(-3,4,5));
        assertEquals(4, TriangleType.triangleType(3,4,-5));
        assertEquals(5, TriangleType.triangleType(3,4,1001));
        assertEquals(4, TriangleType.triangleType(3,3,6));
    }
}