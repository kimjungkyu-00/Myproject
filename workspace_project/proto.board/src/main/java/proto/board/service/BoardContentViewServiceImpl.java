package proto.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proto.board.dao.BoardContentViewDAO;
import proto.board.domain.BoardContentVO;

@Service
public class BoardContentViewServiceImpl implements BoardContentViewService {

    @Autowired
    private BoardContentViewDAO boardContentViewDAO;

    public BoardContentVO getBoardContentVO() {
        return (BoardContentVO)boardContentViewDAO.getBoardContentVO();
    }
}
