package com.minimize.android.rxretrorealm

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by ahmedrizwan on 15/03/2016.
 *
 */
@RealmClass
open class Github : RealmObject() {

  @PrimaryKey
  @SerializedName("id")
  @Expose
  open var id: Int = 0

  @SerializedName("avatar_url")
  @Expose
  open var avatarUrl: String? = null

  @SerializedName("name")
  @Expose
  open var name: String? = null

  @SerializedName("public_repos")
  @Expose
  open var publicRepos: Int? = null

}

