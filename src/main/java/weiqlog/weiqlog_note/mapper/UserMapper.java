package weiqlog.weiqlog_note.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    String getUserName(@Param("name") String name, @Param("id") Long id);
}
