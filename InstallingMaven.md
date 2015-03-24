# How to install Maven
1. Check your operating system.
If you are using Windows, click [here](http://mirror.nus.edu.sg/apache/maven/maven-3/3.3.1/binaries/apache-maven-3.3.1-bin.zip).
If you are using Mac OS X / Linux click 
[here](http://mirror.nus.edu.sg/apache/maven/maven-3/3.3.1/binaries/apache-maven-3.3.1-bin.tar.gz)

The download may be slow from your region because this is the NUS mirror, if that is so click 
[here](http://maven.apache.org/download.cgi)

We are using maven 3.2.5, however any version would be fine.

[!!!]Install the JDK first, quick!

2. Now, unzip / unpack the tarball into any directory you like
3. Open a command line session
4. In the command line type `set JAVA_HOME="C:\your\jdk\location"` the jdk location would usually be 
`C:\Program Files\Java\jdk1.8.0_25` (Jdk 8, update 25) for 32-bit Windows systems or `C:\Program Files (x86)\Java\jdk1.8.0_25` on 64-bit 
Windows systems

For Mac and Linux systems, do `$ export JAVA_HOME=/your/jdk/location`
5. Copy the location (file path) where you extracted the maven zip to
6. Now in the command line type `set M2_HOME="C:\where\you\installed\maven"` (windows systems)

For Mac and Linux systems, do `$ export M2_HOME=/where/you/installed/maven`
7. Once that is done, type `set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin` (windows systems)

For Mac and Linux systems, do `$ export PATH=$PATH:$JAVA_HOME/bin:$M2_HOME/bin`

8. Test! do `$ mvn -version` (Mac and Linux) or `mvn -version` (Windows)
If you get a error message, don't ask us for help!
