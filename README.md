# AndroidUnitTests

Android unit tests explained: instrumented and non instrumented unit tests. See blog posts for more info:


The first post [blog post](https://medium.com/@yair.kukielka/android-unit-tests-explained-219b04dc55b5) covers:

*  *JsonParserTest*: you'll find it in the 'androidTest' (instrumented) and 'test' (local, non instrumented unit test) folders.
*  *FileSerializerTest*: non-instrumented test that uses file operations without a context
*  *SharedPreferencesTest*: instrumented test that uses and Android context to work with shared preferences

The second post [blog post](https://medium.com/@yair.kukielka/android-unit-tests-explained-part-2-a0f1e1413569) covers:

*  *AssetTest*: you'll find it in the 'androidTest' (instrumented) and 'test' (local, non instrumented unit test) folders.

***

#### To run the instrumented tests use:
`./gradlew connectedCheck`

#### For the local or non-instrumented tests:
`./gradlew test`
