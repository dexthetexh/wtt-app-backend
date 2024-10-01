#include <jni.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_wtt_wttapp_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    return env->NewStringUTF("Hello from C++");
}
