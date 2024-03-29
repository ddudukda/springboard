package com.fastcampus.projectspringboard.dto.request;

import com.fastcampus.projectspringboard.dto.ArticleCommentDto;
import com.fastcampus.projectspringboard.dto.UserAccountDto;

public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }

}