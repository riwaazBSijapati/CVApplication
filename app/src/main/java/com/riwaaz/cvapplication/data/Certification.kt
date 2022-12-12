package com.riwaaz.cvapplication.data

data class Certification(
    val logo: String,
    val name: String
) {
    companion object {
        fun getCertificateList(): MutableList<Certification> {
            return mutableListOf(
                Certification(
                    "https://t3.ftcdn.net/jpg/02/48/42/64/360_F_248426448_NVKLywWqArG2ADUxDq6QprtIzsF82dMF.jpg",
                    "Placeholder Image Certification"
                )
            )
        }
    }
}
