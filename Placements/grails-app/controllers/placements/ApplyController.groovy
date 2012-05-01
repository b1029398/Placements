package placements

class ApplyController {

    def index() { }

    def processApplication() {

        log.debug(params.txtName)

        def foundStudent = Student.findByName(params.txtName)
        log.debug(foundStudent)

        def foundStatus = Status.findByDescription('Yes')
        log.debug(foundStatus)

        def foundPlacement = Placement.findByCompanyName(params.txtPlacement)
        log.debug("placement:${foundPlacement}")



        def createApplication = new Application(student:foundStudent,
                        status:foundStatus,
                        placement:foundPlacement)
                        createApplication.save();

        redirect(controller:'application')};

}
