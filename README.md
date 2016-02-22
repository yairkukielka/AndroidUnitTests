# AndroidUnitTests

Simple, instrumented and non instrumented Android unit tests.

See [blog post](https://medium.com/@yair.kukielka/219b04dc55b5) for more info.

***

1. *JsonParserTest*: you'll find it in the 'androidTest' (instrumented) and 'test' (local, non instrumented unit test) folders.
2. *FileSerializerTest*: non-instrumented test that uses file operations without a context
3. *SharedPreferencesTest*: instrumented test that uses and Android context to work with shared preferences

***

#### To run the instrumented tests use:
`./gradlew connectedCheck`

#### For the local or non-instrumented tests:
`./gradlew test`
