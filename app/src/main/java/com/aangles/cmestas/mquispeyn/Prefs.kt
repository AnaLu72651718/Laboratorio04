package com.aangles.cmestas.mquispeyn

import android.content.Context
import java.security.AccessControlContext

class Prefs(val context: Context) {

    val SHARED_PERIODO = "sadasd"
    val SHARED_USER_PERIODO ="periodo"
    val storagep = context.getSharedPreferences(SHARED_PERIODO,0)

    val SHARED_ESCUELA = "ASD"
    val storagee = context.getSharedPreferences(SHARED_ESCUELA,0)
    val SHARED_USER_ESCUELA ="periodo"

    val SHARED_CODIGO = "ASD"
    val storagec = context.getSharedPreferences(SHARED_CODIGO,0)
    val SHARED_USER_CODIGO ="periodo"

    val SHARED_NOMBRE = "ASD"
    val storagen = context.getSharedPreferences(SHARED_NOMBRE,0)

    val SHARED_SEMESTRE = "ASD"
    val storages = context.getSharedPreferences(SHARED_SEMESTRE,0)

    val SHARED_DURACION = "ASD"
    val storaged = context.getSharedPreferences(SHARED_DURACION,0)


     fun saveName(name:String){
         storagep.edit().putString(SHARED_USER_PERIODO, periodo).apply()
     }

}