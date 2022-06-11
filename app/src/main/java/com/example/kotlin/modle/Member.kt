package com.example.kotlin.modle

import java.io.Serializable
class Member(var id: Int, var xabar: String): Serializable{

    override fun toString():String {
        return "Member{" +
                "id=" + id +
                ", xabar='" + xabar + '\'' +
                '}'
    }
}