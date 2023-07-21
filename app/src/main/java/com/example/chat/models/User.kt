package com.example.chat.models

class User {
    var id: String? = null
    var name: String? = null
    var imageLink: String? = null

    constructor(id: String?, name: String?, imageLink: String?) {
        this.id = id
        this.name = name
        this.imageLink = imageLink
    }

    constructor()
}