
KM-Numbers
---------------------
android library to short long numbers, working on initial implementation of https://github.com/ShootrNetwork/kmnumbers

Usage
-------
```kotlin
KMNumbers.formatNumbers(100L); // should return 100,
KMNumbers.formatNumbers(1000L); // should return 1.0K,
KMNumbers.formatNumbers(10000L); // should return 10.0K,
KMNumbers.formatNumbers(1000000L); // should return 1.0M,
KMNumbers.formatNumbers(10000000L); // should return 10.0M.
```
Download
--------

```groovy
implementation("io.github.nageshks.kmnumbers:kmnumbers:0.1.0")
```

License
-------

    Copyright (C) 2021 Nagesh Empire

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

