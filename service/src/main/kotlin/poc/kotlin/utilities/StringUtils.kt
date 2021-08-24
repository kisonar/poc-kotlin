/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package poc.kotlin.utilities

import poc.kotlin.list.LinkedList

class StringUtils {
    companion object {
        fun join(source: LinkedList): String {
            return JoinUtils.join(source)
        }

        fun split(source: String): LinkedList {
            return SplitUtils.split(source)
        }
    }
}
