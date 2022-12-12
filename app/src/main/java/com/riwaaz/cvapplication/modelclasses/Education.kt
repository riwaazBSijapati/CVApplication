package com.riwaaz.cvapplication.modelclasses

data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master of Science in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "CUNY Bernard M. Baruch College",
                    "Bachelor of Business Administration in Data Analytics",
                    "https://zicklin.baruch.cuny.edu/wp-content/themes/ZKiFactory/img/icons/baruch-logo-print@2x.png"
                ),
                Education(
                    "CUNY Borough Of Manhattan Community College",
                    "Associate of Science in Business Administration & Marketing",
                    "https://bmccprodstroac.blob.core.windows.net/uploads/2022/01/logo-2line.jpg"
                )
            )
        }
    }
}
