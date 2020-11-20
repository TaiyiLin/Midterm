package com.example.midtermproject

import com.google.firebase.Timestamp

data class Articles(


    var author_id : String = "",

    var catagory : String = "",

    var content : String = "",

    val created_time : Timestamp = Timestamp.now(),

    var id : String = "",

    var title : String = ""

)