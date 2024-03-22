package com.mysteriouscoder.fireapp.data

//This is a model of our app
data class CNote(
    val uid:String="",
    val content:String="",
    val timestamp: Long=System.currentTimeMillis()
)


data class CDoc(
    val uid:String="",
    val fileUrl:String="",
    val name:String="",
    val mimetype:String="",
    val timestamp: Long=System.currentTimeMillis()
)
