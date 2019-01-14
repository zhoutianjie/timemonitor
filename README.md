# timemonitor
timemonitor
自定义代码打点计时器，用来统计某个模块或者某个方法的运行时间

### 获取引用
在project的gradle文件下添加
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

在module的gradle文件下添加
dependencies {\n
	        implementation 'com.github.zhoutianjie:timemonitor:v1.'
	}

### 使用方法
在要打点的模块或者方法前添加

MonitorId是自定义的，不同id对应不同模块或者方法

在要打点的方法或者模块运行结束之后调用
