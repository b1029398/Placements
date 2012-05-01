import placements.Student
import placements.Placement
import placements.Status

class BootStrap {

    def init = { servletContext ->

        def status1 = new Status(code:'10011', description:'No').save();
        def status2 = new Status(code:'10012', description:'Yes').save();
        def status3 = new Status(code:'10013', description:'No').save();

        def student1 = new Student(name:'Stephen', courseCode:'B1001', notes:'Nothing good to say', application:'Yes').save();
        def student2 = new Student(name:'Luke', courseCode:'B1002', notes:'I dont know', application:'Yes').save();
        def student3 = new Student(name:'Chris', courseCode:'B1003', notes:'No multitasking please', application:'Yes').save();


        def placement1 = new Placement(jobTitle:'Developer', companyName:'BIC', applications:'Yes', status:'Available').save();
        def placement2 = new Placement(jobTitle:'Programmer', companyName:'Google', applications:'No', status:'Available').save();
        def placement3 = new Placement(jobTitle:'Designer', companyName:'Facebook', applications:'Yes', status:'No').save();


        }

        def destroy = {
        }
}
