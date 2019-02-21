package thepreviousone.cryptopass

import org.apache.commons.codec.binary.Base64
import java.lang.RuntimeException
import java.security.NoSuchAlgorithmException
import java.security.InvalidKeyException
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

object PasswordMaker {

    val iterations = 500000
    val keyLength = 256

    @JvmStatic
    fun make(secret: String, username: String, url: String): String {
        val salt = "$username@$url"

        val digest = hashPassword(
                    secret.toCharArray(),salt.toByteArray(), iterations, keyLength)
        val password = Base64.encodeBase64String(digest)
        return password.replace("==", "=").replace("=", "+")
    }

    fun hashPassword(secretChars: CharArray, salt: ByteArray, iterations: Int, keyLength: Int): ByteArray? {
        try {
            val skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512")
            val spec = PBEKeySpec(secretChars, salt, iterations, keyLength)
            val key = skf.generateSecret(spec)
            return key.encoded
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

}
