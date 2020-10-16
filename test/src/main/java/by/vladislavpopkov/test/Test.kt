package by.vladislavpopkov.test

import android.os.Handler
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import java.lang.Exception
import java.util.*

data class Test(val a: Int)

fun main() {
    t()
    println("test revert commit")
}

private fun t() {
    try {
        b()
    }catch (e: Throwable){
        throw e
    }

println("dsadsa")
   }
private fun b(){
    throw IllegalAccessException()
}