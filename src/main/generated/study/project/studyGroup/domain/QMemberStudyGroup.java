package study.project.studyGroup.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberStudyGroup is a Querydsl query type for MemberStudyGroup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberStudyGroup extends EntityPathBase<MemberStudyGroup> {

    private static final long serialVersionUID = -1589647108L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberStudyGroup memberStudyGroup = new QMemberStudyGroup("memberStudyGroup");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final QMember studyGroup;

    public QMemberStudyGroup(String variable) {
        this(MemberStudyGroup.class, forVariable(variable), INITS);
    }

    public QMemberStudyGroup(Path<? extends MemberStudyGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberStudyGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberStudyGroup(PathMetadata metadata, PathInits inits) {
        this(MemberStudyGroup.class, metadata, inits);
    }

    public QMemberStudyGroup(Class<? extends MemberStudyGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
        this.studyGroup = inits.isInitialized("studyGroup") ? new QMember(forProperty("studyGroup"), inits.get("studyGroup")) : null;
    }

}

