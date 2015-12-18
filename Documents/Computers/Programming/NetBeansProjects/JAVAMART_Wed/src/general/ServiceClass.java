package general;
public class ServiceClass 
{
    private static int empId = 1000;
    public static int getEmpId()
    { return empId++; }
}
