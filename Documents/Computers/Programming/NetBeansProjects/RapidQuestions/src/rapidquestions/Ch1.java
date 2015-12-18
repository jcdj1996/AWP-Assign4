/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidquestions;

import java.util.ArrayList;

/**
 *
 * @author Ari
 */
public class Ch1 {
    //Constants
    private static String[] TRUE_OR_FALSE = new String[]{"True", "False"};

    //Variables
    private static ArrayList<Question> questions = new ArrayList<>();
    
    public static void main(String[] args) {
        
        questions.add(new Question("Until the 1980s, project management primarily focused on providing schedule and resource data to top management in the military, computer, and construction industries.",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("A research report showed that the U.S. spends $2.3 trillion on projects every year, an amount equal to 40 percent of the nation's gross domestic product.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("One attribute that helps define a project is that a project has a unique purpose.",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Projects are often defined narrowly when they begin.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Projects rarely involve uncertainty.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Every project is constrained in different ways by its scope and cost goals; these limitations are sometimes referred to in project management as the double constraint.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Every project is constrained in different ways by its scope and cost goals; these limitations are sometimes referred to in project management as the double constraint.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Every project is constrained in different ways by its scope and cost goals; these limitations are sometimes referred to in project management as the double constraint.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Questions about how long a project's schedule should be are related to the issue of the project's scope.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Because projects involve uncertainty and limited resources, projects rarely finish according to discrete scope, time, and cost goals as originally planned.",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Managing the triple constraint involves making trade-offs between scope, time, and cost goals for a project.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Some people refer to the \"double constraint\" of project management to include quality and customer satisfaction.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("In the example of building a new house, the support staff would provide the wood, windows, flooring materials, appliances, and so on.",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Stakeholders' needs and expectations are only important in the beginning of a project.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("There are six core knowledge areas of project management.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Follow-up studies done by the Standish Group showed that the number of failed projects has more than doubled in the past decade.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("The 2006 Standish Group survey showed that IT project success rates had risen from 16 percent in 1994 to 35 percent in 2006.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Project management is the silver bullet that guarantees success on all projects.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("A key finding of a 2004 study is that relationship management is viewed as a top success factor for information systems in China, while it is not mentioned in U.S. studies.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Winners in project delivery know that strong program managers—referred to as project leaders—are crucial to project success.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("A program is \"a group of related projects managed in a coordinated way to obtain benefits and control not available from managing them individually.\"	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Program managers are not responsible for coordinating the efforts of project teams, functional groups, suppliers, and operations staff.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("The job description for a project manager can vary by industry and by organization.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Project managers should possess general management knowledge and skills.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Project managers must be able to make effective use of technology as it relates to the specific project.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Project managers for large information technology projects have to be experts in the field of information technology.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Project managers often take on the role of both leader and manager.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Today's project managers still draw Gantt charts by hand.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("Determining the relationships among tasks is not essential in helping to improve project scheduling.	",
                TRUE_OR_FALSE, "False"));
        questions.add(new Question("New software makes basic tools, such as Gantt charts and network diagrams, inexpensive, easy to create, and available for anyone to update.	",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("Many people still use basic productivity software, such as Microsoft Word or Excel, to perform many project management functions.",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("A research report showed that the U.S. spends ____ on projects every year.",
                "$2.3 billion\nc$23 billion\n$2.3 trillion\n$23 trillion".split("\n"), "$2.3 trillion"));  
        questions.add(new Question("A research report showed that the U.S. spends the equivalent of ____ percent of the nation&#039;s gross domestic product on projects every year.",
                "10\n20\n25\n50".split("\n"), "25"));
        questions.add(new Question("Many organizations assert that using project management provides advantages, such as ____.",
                "lower profit margins\nlower costs\nless internal coordination\nlower worker morale".split("\n"), "lower costs"));
        questions.add(new Question("Because a project requires resources, often from various areas, many projects cross ____ or other boundaries to achieve their unique purposes.",
                "financial\nspatial\ndepartmental\ntechnological".split("\n"), "departmental"));
        questions.add(new Question("The project ____ usually provides the direction and funding for the project.",
                "leader\nsponsor\nmanager\ndirector".split("\n"), "sponsor"));
        questions.add(new Question("The limitations of scope, time, and cost goals are sometimes referred to as the ____.",
                "double bind\ntriple constraint\ndouble constraint\ndouble obstacle".split("\n"), "triple constraint"));
        questions.add(new Question("____ are the people involved in or affected by project activities and include the project sponsor, project team, support staff, customers, users, suppliers, and even opponents of the project.",
                "Managers\nStakeholders\nDirectors\nCitizens".split("\n"), "Stakeholders"));
        questions.add(new Question("In the example of the project of building a house, the project sponsors would be the potential ____.",
                "contractors\nsupport staff\nmanagers\nnew homeowners".split("\n"), "new homeowners"));
        questions.add(new Question("In the example of the project of building a house, the ____ would normally be the general contractor responsible for building the house.",
                "project sponsors\nproject team\nproject manager\nsupport staff".split("\n"), "project manager"));
        questions.add(new Question("Project ____ management involves defining and managing all the work required to complete the project successfully.",
                "scope\nquality\ntime\ncost".split("\n"), "scope"));
        questions.add(new Question("Project ____ management ensures that the project will satisfy the stated or implied needs for which it was undertaken.",
                "cost\ntime\nscope\nquality".split("\n"), "quality"));
        questions.add(new Question("Project ____ management is concerned with making effective use of the people involved with the project.",
                "human resource\nrisk\ncommunications\nprocurement".split("\n"), "human resource"));
        questions.add(new Question("Project ____ management involves generating, collecting, disseminating, and storing project information.",
                "risk\nprocurement\ncommunications\nresource".split("\n"), "communications"));
        questions.add(new Question("Project ____ management is an overarching function that affects and is affected by all of the other knowledge areas.",
                "cost\nquality\nintegration\ntime".split("\n"), "integration"));
        questions.add(new Question("What works on one project may not work on another, so it is essential for project managers to continue to develop their knowledge and ____ in managing projects.",
                "time\nresources\nfunding\nskills".split("\n"), "skills"));
        questions.add(new Question("According to the Standish group, which of the following factors contributes most to the success of information technology projects?",
                "Executive support\nUser involvement\nExperienced project manager\nClear business objectives".split("\n"), "Executive support"));
        questions.add(new Question("According to the Standish Group study describing what factors contribute most to the success of information technology projects, ____ percent of successful projects are led by experienced project managers.",
                "75\n80\n97\n100".split("\n"), "97"));
        questions.add(new Question("\"All project leaders use a shared road map, focusing on key business aspects of their projects while integrating goals across all parts of the organization\" describes the ____ best practice for project delivery.",
                "Use an integrated toolbox\nGrow project leaders\nDevelop a streamlined project delivery process\nMeasure project health using metrics".split("\n"), "Develop a streamlined project delivery process"));
        questions.add(new Question("____ project management software integrates information from multiple projects to show the status of active, approved, and future projects across an entire organization.",
                "Investment\nActive\nEnterprise\nBudget".split("\n"), "Enterprise"));
        questions.add(new Question("A ____ can have many different job descriptions, which can vary tremendously based on the organization and the project.",
                "project supervisor\nproject manager\njob coordinator\nproject coordinator".split("\n"), "project manager"));
        questions.add(new Question("In an interview with two chief information officers (CIOs), both men agreed that the most important project management skills seem to depend on ____.",
                "the difficulty of the project and the resources involved\nthe difficulty of the task and the people involved\nthe uniqueness of the project and the difficulty of the task\nthe uniqueness of the project and the people involved".split("\n"), "the uniqueness of the project and the people involved"));
        questions.add(new Question("Achieving high performance on projects requires ____, otherwise called human relations skills.",
                "capital skills\nsoft skills\nlight skills\nhard skills".split("\n"), "soft skills"));
        questions.add(new Question("A(n) ____ focuses on long-term goals and big-picture objectives, while inspiring people to reach those goals.",
                "assistant\nprogrammer\nleader\nmanager".split("\n"), "leader"));
        questions.add(new Question("A(n) ____ often deals with the day-to-day details of meeting specific goals.",
                "manager\nleader\nprogrammer\nanalyst".split("\n"), "leader"));
        questions.add(new Question("Some people say that ____ achieve the vision of a project.",
                "leaders\nmanagers\nstakeholders\nsupervisors".split("\n"), "managers"));
        questions.add(new Question("Most people agree that the modern concept of project management began with the ____.",
                "Great Wall of China\nfirst space shuttle\nEgyptian pyramids\nManhattan Project".split("\n"), "Manhattan Project"));
        questions.add(new Question("The Manhattan Project cost almost $2 billion in ____.",
                "1936\n1946\n1956\n1966".split("\n"), "1946"));
        questions.add(new Question("In ____, Henry Gantt developed the famous Gantt chart as a tool for scheduling work in factories.",
                "1897\n1917\n1927\n1957".split("\n"), "1917"));
        questions.add(new Question("A Gantt chart is a standard format for displaying project schedule information by listing project activities and their corresponding start and finish dates in a ____ format.",
                "pie chart\nline graph\nbar graph\ncalendar".split("\n"), "calendar"));
        questions.add(new Question("During the Cold War years of the 1950s and 1960s, ____ continued to be key in refining several project management techniques.",
                "NASA\nthe military\nsteel manufacturing\nmarine biology".split("\n"), "the military"));
        questions.add(new Question("The longest path through a network diagram that determines the earliest completion of a project is called the ____ path.",
                "essential\nimportant\ncritical\nvital".split("\n")
        , "critical"));         
         questions.add(new Question("By the ____, the U.S. military and its civilian suppliers developed software to assist in managing large projects.",
                "1960s\n1970s\n1980s\n1990s".split("\n"), "1970s"));
        questions.add(new Question("____ was an early project management software product that helped managers analyze complex schedules for designing aircraft.",
                "Artemis\nColumbia\nVega\nOberlin".split("\n"), "Artemis"));
        questions.add(new Question("A PMO, or Project ____ Office, is an organizational group responsible for coordinating the project management function throughout an organization.",
                "Management\nMoney\nMunicipal\nMarketing".split("\n"), "Management"));
        questions.add(new Question("Many organizations are now using enterprise or project ____ management software to help manage projects.",
                "path\nportfolio\ninstitute\noffice".split("\n"), "portfolio"));
        questions.add(new Question("PMI provides certification as a Project Management ____ (PMP), someone who has documented sufficient project experience and education, agreed to follow the PMI code of professional conduct, and demonstrated knowledge of the field of project management by passing a comprehensive examination.",
                "Producer\nPractitioner\nProfessional\nProfessor".split("\n"), "Professional"));
        questions.add(new Question("Just as passing the CPA exam is a standard for accountants, passing the ____ exam is becoming a standard for project managers.",
                "PMI\nPM\nPMP\nPMO".split("\n"), "PMP"));
        questions.add(new Question("The Project Management ____, a Web site for people involved in project management, provides an alphabetical directory of more than 300 project management software solutions.",
                "Center\nAlliance\nConsortium\nFacility".split("\n"), "Center"));
        questions.add(new Question("____ tools are often recommended for small projects and single users.",
                "Low-end\nMidrange\nHigh-end\nExpensive".split("\n"), "Low-end"));
        questions.add(new Question("____ tools, sometimes referred to as enterprise project management software, provide robust capabilities to handle very large projects.",
                "Low-end\nMidrange\nHigh-end\nInexpensive".split("\n"), "High-end"));    }
    
}
