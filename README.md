# timemonitor  
timemonitor  
自定义代码打点计时器，用来统计某个模块或者某个方法的运行时间

### 获取引用  
在project的gradle文件下添加  
&emsp;&emsp;allprojects {  
&emsp;&emsp;&emsp;repositories {  
&emsp;&emsp;&emsp;&emsp;...  
&emsp;&emsp;&emsp;&emsp;maven { url 'https://jitpack.io' }  
&emsp;&emsp;&emsp;}  
&emsp;&emsp;}  
  
在module的gradle文件下添加  
dependencies {  
&emsp;&emsp;&emsp;implementation 'com.github.zhoutianjie:timemonitor:v1.1'  
&emsp;&emsp;}  
  
### 使用方法  
获取不同模块的TimeMonitor,Monitor是自定义，用来区分不同模块或方法  
TimeMonitor monitor = TimeMonitorManager.Instance().getTimeMonitor(MonitorId.monitorId_1.ordinal());  
在要打点的模块或者方法前添加  
monitor.startMonitor();  
  
在要打点的方法或者模块运行结束之后调用  
 monitor.recordingTimeTag("tag");  
 这里对应的"tag",对应某个模块的不同子模块。  
   
 最后通过  
 long time = monitor.getmTimeTags().get("tag");  
 获取某个tag子模块的执行时间  
 源码比较简单，可以自行查看。这里我也只是熟悉一下jitPack的使用  
 
