import com.dao.IStudentDao;
import com.domain.Student;
import com.util.MybatisUtils;
import com.util.UUIDs;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ClassMain {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IStudentDao dao = sqlSession.getMapper(IStudentDao.class);
        List<Student> students = dao.selectAll();
        sqlSession.close();

        System.out.println(students);
        System.out.println(UUIDs.getUUID());

    }
}
