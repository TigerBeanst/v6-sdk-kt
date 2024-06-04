import api.v6.services.pub.LoginRequest
import fail.tiger.util.PubUser
import fail.tiger.util.v6Init
import fail.tiger.util.v6Request
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun test() {
        v6Init()
        runBlocking {
            val result = v6Request(
                PubUser.CreateAuthToken(),
                LoginRequest(return_type = 2, callback = "https://127.0.0.1:8023")
            )
            println(result)
        }
    }
}