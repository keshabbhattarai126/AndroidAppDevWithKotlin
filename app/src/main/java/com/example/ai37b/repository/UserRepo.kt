package com.example.ai37b.repository

import android.graphics.ColorSpace
import com.example.ai37b.model.UserModel
import javax.security.auth.callback.Callback

interface UserRepo {

    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    )

    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    )

    fun addUserToDatabase(
        userId: String, model: UserModel,
        callback: (Boolean, String) -> Unit
    )

    fun forgetPassword(
        email: String,
        callback: (Boolean, String) -> Unit
    )

    fun getUserByID(userId: String,
                    callback: (Boolean, String, UserModel?) -> Unit)

    fun getAllUser(callback: (Boolean, String,List<UserModel>) -> Unit)

    fun editProfile(userId: String,model: UserModel,callback: (Boolean, String) -> Unit)

    fun deleteAccount(userId: String,callback: (Boolean, String) -> Unit)


}