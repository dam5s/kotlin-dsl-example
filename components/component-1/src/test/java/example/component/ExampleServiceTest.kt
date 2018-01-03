package example.component

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class ExampleServiceTest {

    @Test
    fun test() {
        assertThat(true, equalTo(true))
    }
}
