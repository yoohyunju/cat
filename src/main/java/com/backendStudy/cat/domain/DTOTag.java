package com.backendStudy.cat.domain;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DTOTag {
    private long tagIdx;        // 인덱스
    private long boardIdx;       // 게시글인덱스
    private long userIdx;        // 유저인덱스
    private String tagName;     // 태그명
    private Date date;     // 등록일
    private Date update;        // 수정일
}
