package dev.eternal.launcher

import dev.eternal.launcher.check.Check
import dev.eternal.launcher.check.CheckStore
import dev.eternal.util.test.TestUtils
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Tests the check store to ensure its working properly.
 *
 * @author Cody Fullen
 */
class CheckStoreTests {

    @Test
    fun testAddCheck() {
        val store = CheckStore()
        val checks = TestUtils.getField<ObjectOpenHashSet<Check>>(store, "checks")
        assertTrue(checks.size > 0)
    }
}