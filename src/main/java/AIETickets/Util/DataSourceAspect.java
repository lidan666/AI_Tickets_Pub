package AIETickets.Util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
4      * ����Ŀ�귽������ȡ��@DataSourceָ��������Դ��ʶ�����õ��̴߳洢���Ա��л�����Դ
5      * 
6      * @param point
7      * @throws Exception
8      */
@Component
public class DataSourceAspect {
	
	/**
     * ����Ŀ�귽������ȡ��@DataSourceָ��������Դ��ʶ�����õ��̴߳洢���Ա��л�����Դ
     * 
     * @param point
     * @throws Exception
     */
    public void intercept(JoinPoint point) throws Exception {
        Class<?> target = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature) point.getSignature();
        // Ĭ��ʹ��Ŀ�����͵�ע�⣬���û����ʹ����ʵ�ֽӿڵ�ע��
        for (Class<?> clazz : target.getInterfaces()) {
            resolveDataSource(clazz, signature.getMethod());
//            System.out.println("change datasource");
        }
        resolveDataSource(target, signature.getMethod());
    }

    /**
     * ��ȡĿ����󷽷�ע�������ע���е�����Դ��ʶ
     * 
     * @param clazz
     * @param method
     */
    private void resolveDataSource(Class<?> clazz, Method method) {
        try {
            Class<?>[] types = method.getParameterTypes();
            // Ĭ��ʹ������ע��
            if (clazz.isAnnotationPresent(DataSource.class)) {
                DataSource source = clazz.getAnnotation(DataSource.class);
                DataSourceContextHolder.setDbType(source.value());
              
            }
            // ����ע����Ը�������ע��
            Method m = clazz.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource source = m.getAnnotation(DataSource.class);
                DataSourceContextHolder.setDbType(source.value());
            }
        } catch (Exception e) {
            System.out.println(clazz + ":" + e.getMessage());
        }
    }
	
	
}



