package com.example.ecoavalon.models

import java.text.SimpleDateFormat
import java.util.Date

class MyMessage {
    var id:String?=null
    var text:String?=null


    constructor()
    constructor(id: String?, text: String?) {
        this.id = id
        this.text = text
    }

    var date = SimpleDateFormat("dd.MM.yyyy HH.mm.ss").format(Date())
}