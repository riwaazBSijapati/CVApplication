package com.riwaaz.cvapplication.modelclasses

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {

        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "SpecialtyCare Inc.",
                    "August 2021",
                    "November 2021",
                    "Irving, TX",
                    "https://media.licdn.com/dms/image/C4E0BAQGMzy4KhaQREQ/company-logo_200_200/0/1644957846143?e=1678924800&v=beta&t=ypY0BazHJ-JXetWm-zda336w-3RkvkQOKaQFh35KQkM",
                    "Data Analyst: Played key role on data team engaged in verifying, combining, and uploading multiple sources Salesforce system for SpecialtyCare, Inc.’s Perfusion Pipeline project. \n" +
                            "•\t Analyzed data, conducted ETL, and ensured data integrity. \n" +
                            "•\t Used Python and Excel to extract and transform data into a cohesive and usable data source.\n" +
                            "•\t Leveraged Python to automate tasks and develop custom programs to draw data from websites.\n" +
                            "•\t Conducted Data Integration and loading into Salesforce.\n"
                ),
                Work(
                    "Research Foundation CUNY",
                    "October 2020",
                    "January 2021",
                    "New York City, NY",
                    "https://media-exp1.licdn.com/dms/image/C560BAQHCya33E38N2Q/company-logo_200_200/0/1522074883327?e=2147483647&v=beta&t=TcobLDAO3jZAA5d0lSis_dHOpWv7n4l6aPzf5zAhOxg",
                    "Data Researcher: Acquired and analyzed information regarding college course trends in CUNY educational system. \n" +
                            "•\t Performed deep research and analysis regarding enrollment, curricula, and graduation statistics. \n" +
                            "•\t Used Python to construct and edit data frames in Pandas, pulling data from publicly available sources. \n" +
                            "•\t Developed research summaries that identified trends in curriculums across top US colleges. \n" +
                            "•\t Constructed Tableau dashboards to visualize research data.\n"
                ),
                Work(
                    "New York Motorcycle",
                    "March 2016",
                    "December 2019",
                    "New York City, NY",
                    "https://newyorkmotorcycle.com/portals/newyorkmotorcycle/Skins/newyorkmotorcycle-Redline-HD//images/nymotorcycleLogo-24.png",
                    "Software Developer: Implemented backend development for company web applications.\n" +
                            "•\t Analyzed and produced planned solutions for system requirements.\n" +
                            "•\t Produced entity relation designs for systems and databases.\n" +
                            "•\t Added Spring Security features using JSON Web Tokens (JWT).\n" +
                            "•\t Maintained and developed REST API using Spring Boot.\n" +
                            "•\t Designed and implemented highly functional databases using PostgreSQL Database.\n"
                ),
            )
        }
    }
}
