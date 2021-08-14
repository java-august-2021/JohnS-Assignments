public class ProjectTest {
    public static void main(String[] args) {
        Project newProject = new Project();
        newProject.setName("Test");
        newProject.setDescription("description");
        System.out.println(newProject.elevatorPitch());
    }
}
