//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji

package rust.interop.bridge

import scala.native

class NativeInterop {
    @native def fetchInteroperability(url: String, paramsJson: String): String
}

object NativeInterop {
    System.loadLibrary("interoperability_ffi_robusta")
}

@main def runScalaBridge(): Unit = {
    NativeInterop
    
    val bridge = new NativeInterop()
    val url = "https://interoperability.onrender.com/filter"
    val params = "{}"
    
    println("Interoperability FFI (Scala CLI)")
    
    try {
        val response = bridge.fetchInteroperability(url, params)
        println(response)
    } catch {
        case e: Exception => 
            println(s"Error: ${e.getMessage}")
            e.printStackTrace()
    }
}

//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji