package util;

/**
 * @description: monitor util
 * @author: hxz
 * @create: 2021-07-09 16:49
 **/
public class MonitorUtil {

  private  static  ThreadLocal<Long> tl = new ThreadLocal<>();

  public static void start(){
    tl.set(System.currentTimeMillis());
  }

  public static void finish(String methodName){
    long finishTime = System.currentTimeMillis();
    System.out.printf(methodName + "方法耗时：" + (finishTime - tl.get()) + "ms\n");
  }


}
