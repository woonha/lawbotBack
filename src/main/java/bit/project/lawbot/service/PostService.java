package bit.project.lawbot.service;

import bit.project.lawbot.domain.BaseDTO;
import bit.project.lawbot.domain.MemberDTO;
import bit.project.lawbot.domain.PostDTO;

import java.util.List;

public interface PostService {
	public BaseDTO<PostDTO> selectPostList(BaseDTO<PostDTO> dto);
	public int insertPost(PostDTO dto);
	public PostDTO selectPost(PostDTO dto);
	public int deletePost(PostDTO dto);
	public int updatePost(PostDTO dto);
}
